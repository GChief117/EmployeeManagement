/**
 * 
 */
package management;

import java.util.ArrayList;
import java.util.List;

import com.virtualprogrammers.expenses.domain.Employee;
import com.virtualprogrammers.expenses.domain.ExpenseClaim;
import com.virtualprogrammers.expenses.domain.StaffEmployee;

/**
 * @author gunnar_beck7
 *
 */
public class RegularExpenseManagementProcess implements ExpenseManagementProcess{

	private List<ExpenseClaim> claims = new ArrayList<>(); 
	//llists can be impllemented with anything
	
	
	/**
	 * 
	 */
	public RegularExpenseManagementProcess() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int registerExpenseClaim(ExpenseClaim claim) {
		claims.add(claim);
		return claims.size() - 1;
	}

	@Override
	public boolean approveClaim(int id, Employee employee) {
		ExpenseClaim claim = claims.get(id);
		if (claim.getTotalAmount() < 100) {
			return true;
		}
		if (employee instanceof StaffEmployee) {
			return true;
		}
		return false;
	}

}
