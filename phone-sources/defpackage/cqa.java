package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqa extends cqs {
    private cpg a;

    public cqa(Context context) {
        super(context);
    }

    @Override // defpackage.cqs, defpackage.cqc
    protected final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.a = new cpg();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cqr.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a.aG = typedArrayObtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    cpg cpgVar = this.a;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
                    cpgVar.aL = dimensionPixelSize;
                    cpgVar.aM = dimensionPixelSize;
                    cpgVar.aN = dimensionPixelSize;
                    cpgVar.aO = dimensionPixelSize;
                } else if (index == 18) {
                    cpg cpgVar2 = this.a;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0);
                    cpgVar2.aN = dimensionPixelSize2;
                    cpgVar2.aP = dimensionPixelSize2;
                    cpgVar2.aQ = dimensionPixelSize2;
                } else if (index == 19) {
                    this.a.aO = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
                } else if (index == 2) {
                    this.a.aP = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
                } else if (index == 3) {
                    this.a.aL = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                } else if (index == 4) {
                    this.a.aQ = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                } else if (index == 5) {
                    this.a.aM = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
                } else if (index == 54) {
                    this.a.aE = typedArrayObtainStyledAttributes.getInt(54, 0);
                } else if (index == 44) {
                    this.a.a = typedArrayObtainStyledAttributes.getInt(44, 0);
                } else if (index == 53) {
                    this.a.b = typedArrayObtainStyledAttributes.getInt(53, 0);
                } else if (index == 38) {
                    this.a.c = typedArrayObtainStyledAttributes.getInt(38, 0);
                } else if (index == 46) {
                    this.a.as = typedArrayObtainStyledAttributes.getInt(46, 0);
                } else if (index == 40) {
                    this.a.d = typedArrayObtainStyledAttributes.getInt(40, 0);
                } else if (index == 48) {
                    this.a.at = typedArrayObtainStyledAttributes.getInt(48, 0);
                } else if (index == 42) {
                    this.a.au = typedArrayObtainStyledAttributes.getFloat(42, 0.5f);
                } else if (index == 37) {
                    this.a.aw = typedArrayObtainStyledAttributes.getFloat(37, 0.5f);
                } else if (index == 45) {
                    this.a.ay = typedArrayObtainStyledAttributes.getFloat(45, 0.5f);
                } else if (index == 39) {
                    this.a.ax = typedArrayObtainStyledAttributes.getFloat(39, 0.5f);
                } else if (index == 47) {
                    this.a.az = typedArrayObtainStyledAttributes.getFloat(47, 0.5f);
                } else if (index == 51) {
                    this.a.av = typedArrayObtainStyledAttributes.getFloat(51, 0.5f);
                } else if (index == 41) {
                    this.a.aC = typedArrayObtainStyledAttributes.getInt(41, 2);
                } else if (index == 50) {
                    this.a.aD = typedArrayObtainStyledAttributes.getInt(50, 2);
                } else if (index == 43) {
                    this.a.aA = typedArrayObtainStyledAttributes.getDimensionPixelSize(43, 0);
                } else if (index == 52) {
                    this.a.aB = typedArrayObtainStyledAttributes.getDimensionPixelSize(52, 0);
                } else if (index == 49) {
                    this.a.aF = typedArrayObtainStyledAttributes.getInt(49, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.a;
        k();
    }

    @Override // defpackage.cqs
    public final void b(cpk cpkVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (cpkVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            cpkVar.W(mode, size, mode2, size2);
            setMeasuredDimension(cpkVar.aS, cpkVar.aT);
        }
    }

    @Override // defpackage.cqc
    public final void c(cpd cpdVar, boolean z) {
        cpg cpgVar = this.a;
        int i = cpgVar.aN;
        if (i > 0 || cpgVar.aO > 0) {
            if (z) {
                cpgVar.aP = cpgVar.aO;
                cpgVar.aQ = i;
            } else {
                cpgVar.aP = i;
                cpgVar.aQ = cpgVar.aO;
            }
        }
    }

    @Override // defpackage.cqc, android.view.View
    protected final void onMeasure(int i, int i2) {
        b(this.a, i, i2);
    }

    public cqa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public cqa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
