package dao;

import java.util.List;
import model.Register;

public interface DonorDao {
	 int register(List<Register>lst);
	 List<Register>login(String email);
}
