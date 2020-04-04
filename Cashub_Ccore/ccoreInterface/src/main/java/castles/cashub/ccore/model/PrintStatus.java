package castles.cashub.ccore.model;


/**
 * This model is for print staus.
 *
 * */
public enum PrintStatus {
    /**
     * Its mean the printer is busy.
     */
    BUSY,
    /**
     * Its mean the printer have error.
     */
    ERROR,
    /**
     * Printer is out of paper.
     */
    OUT_OF_PAPER,
    /**
     *Printer is idle now.
     */
    IDLE
}