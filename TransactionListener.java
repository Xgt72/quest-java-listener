public interface TransactionListener {

    /**
     * the transaction process is in progress
     */
    void onLoading();

    /**
     * @param account returns the bank
     */
    void onComplete(Bank account);

    /**
     * @param error returns the error message
     */
    void onError(String error);

}