
public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public Customer findCustomerByName(String customerName) {
			try {
			Customer c = customerService.findByName(customerName);
			return c;
			} catch (Exception ex) {
			LOG.error("Exception looking up customer by name: " + ex.getMessage(), ex);
			}
			return null;
			}
			User findByUsername(String userName) throws UserNameNotFoundException {
			EntityManager em = entityManagerFactory.createEntityManager();
			return em.createQuery("from User where userName = :userName", User.class)
			.setParameter("userName", userName)
			.getSingleResult();
			}
			public String login(Model model, String username, String password) {
			try {
			// attempt to login user
			userService.login(username, password);
			} catch (Exception ex) {
			model.addAttribute("error", ex.getMessage());
			}
			return "login”;
			}

	}

}
}
