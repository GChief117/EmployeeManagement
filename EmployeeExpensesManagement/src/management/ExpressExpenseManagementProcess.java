/**
 * 
 */
package management;

import com.virtualprogrammers.expenses.domain.Employee;
import com.virtualprogrammers.expenses.domain.ExpenseClaim;

/**
 * @author gunnar_beck7
 *
 */
public class ExpressExpenseManagementProcess implements ExpenseManagementProcess{

    private ExpenseClaim claim;

    @Override
    public int registerExpenseClaim(ExpenseClaim claim) {
        this.claim = claim;
        return -1;
    }

    @Override
    public boolean approveClaim(int id, Employee employee) {
        return (claim.getTotalAmount() < 50);
    }

}
