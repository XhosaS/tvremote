package android.support.v7.app;

/* compiled from: PG */
/* loaded from: classes.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;
    private static final float C1 = 0.0334196f;
    private static final float C2 = 3.49066E-4f;
    private static final float C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;
    private static final float J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    static TwilightCalculator getInstance() {
        if (sInstance == null) {
            sInstance = new TwilightCalculator();
        }
        return sInstance;
    }

    public void calculateTwilight(long j, double d, double d2) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = Math.sin(d3) * 0.03341960161924362d;
        double dSin2 = Math.sin(r2 + r2) * 3.4906598739326E-4d;
        double dSin3 = Math.sin(r2 * 3.0f) * 5.236000106378924E-6d;
        double d4 = (-d2) / 360.0d;
        float fRound = Math.round((r1 - 9.0E-4f) - d4);
        double dSin4 = Math.sin(d3) * 0.0053d;
        double d5 = d3 + dSin + dSin2 + dSin3 + 1.796593063d + 3.141592653589793d;
        double dSin5 = Math.sin(d5 + d5) * (-0.0069d);
        double dAsin = Math.asin(Math.sin(d5) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double dSin6 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(dAsin))) / (Math.cos(d6) * Math.cos(dAsin));
        int i = 1;
        if (dSin6 < 1.0d) {
            if (dSin6 > -1.0d) {
                double d7 = fRound + J0 + d4 + dSin4 + dSin5;
                double dAcos = (float) (Math.acos(dSin6) / 6.283185307179586d);
                this.sunset = Math.round((d7 + dAcos) * 8.64E7d) + UTC_2000;
                long jRound = Math.round((d7 - dAcos) * 8.64E7d) + UTC_2000;
                this.sunrise = jRound;
                if (jRound < j && this.sunset > j) {
                    i = 0;
                }
                this.state = i;
                return;
            }
            i = 0;
        }
        this.state = i;
        this.sunset = -1L;
        this.sunrise = -1L;
    }
}
