package android.support.v7.widget;

/* compiled from: PG */
/* loaded from: classes.dex */
class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mLeft = 0;
    private int mRight = 0;
    private int mStart = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft = 0;
    private int mExplicitRight = 0;
    private boolean mIsRtl = false;
    private boolean mIsRelative = false;

    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }

    public void setAbsolute(int i, int i2) {
        this.mIsRelative = false;
        if (i != Integer.MIN_VALUE) {
            this.mExplicitLeft = i;
            this.mLeft = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mExplicitRight = i2;
            this.mRight = i2;
        }
    }

    public void setDirection(boolean z) {
        if (z == this.mIsRtl) {
            return;
        }
        this.mIsRtl = z;
        if (!this.mIsRelative) {
            this.mLeft = this.mExplicitLeft;
            this.mRight = this.mExplicitRight;
            return;
        }
        if (z) {
            int i = this.mEnd;
            if (i == Integer.MIN_VALUE) {
                i = this.mExplicitLeft;
            }
            this.mLeft = i;
            int i2 = this.mStart;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.mExplicitRight;
            }
            this.mRight = i2;
            return;
        }
        int i3 = this.mStart;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.mExplicitLeft;
        }
        this.mLeft = i3;
        int i4 = this.mEnd;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.mExplicitRight;
        }
        this.mRight = i4;
    }

    public void setRelative(int i, int i2) {
        this.mStart = i;
        this.mEnd = i2;
        this.mIsRelative = true;
        boolean z = this.mIsRtl;
        boolean z2 = i2 == Integer.MIN_VALUE;
        boolean z3 = i == Integer.MIN_VALUE;
        boolean z4 = true != z ? z3 : z2;
        int i3 = true != z ? i : i2;
        if (true == z) {
            z2 = z3;
        }
        if (true != z) {
            i = i2;
        }
        if (true != z4) {
            this.mLeft = i3;
        }
        if (true != z2) {
            this.mRight = i;
        }
    }
}
