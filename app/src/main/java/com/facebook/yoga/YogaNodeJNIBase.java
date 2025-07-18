package com.facebook.yoga;

import defpackage.a;
import defpackage.drq;
import defpackage.dsq;
import defpackage.dsz;
import defpackage.dvk;
import defpackage.dwa;
import defpackage.dxt;
import defpackage.dxu;
import defpackage.ebc;
import defpackage.end;
import defpackage.eny;
import defpackage.eob;
import defpackage.eoc;
import defpackage.eod;
import defpackage.eoe;
import defpackage.eog;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends eoe implements Cloneable {
    public YogaNodeJNIBase a;
    private float[] arr;
    public List b;
    public long c;
    public Object d;
    public dwa e;
    private int mLayoutDirection;

    YogaNodeJNIBase() {
        throw null;
    }

    public static eog j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException(a.b(i, "Unknown enum value: "));
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        return new eog(fIntBitsToFloat, i2);
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.b;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.b.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.a = this;
        return yogaNodeJNIBase.c;
    }

    @Override // defpackage.eoe
    public final float a() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // defpackage.eoe
    public final float b() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    @Override // defpackage.eoe
    public final float c() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // defpackage.eoe
    public final float d() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // defpackage.eoe
    public final eny e() {
        float[] fArr = this.arr;
        int i = fArr != null ? (int) fArr[5] : this.mLayoutDirection;
        if (i == 0) {
            return eny.INHERIT;
        }
        if (i == 1) {
            return eny.LTR;
        }
        if (i == 2) {
            return eny.RTL;
        }
        throw new IllegalArgumentException(a.b(i, "Unknown enum value: "));
    }

    @Override // defpackage.eoe
    public final Object f() {
        return this.d;
    }

    @Override // defpackage.eoe
    public final void g(eny enyVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.c, enyVar.d);
    }

    @Override // defpackage.eoe
    public final float h(int i) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i2 = (int) fArr[0];
        if ((i2 & 4) != 4) {
            return 0.0f;
        }
        int i3 = i - 1;
        int i4 = (14 - (1 != (i2 & 1) ? 4 : 0)) - ((i2 & 2) != 2 ? 4 : 0);
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? fArr[i4 + 3] : fArr[i4 + 2] : fArr[i4 + 1] : fArr[i4];
    }

    @Override // defpackage.eoe
    public final float i(int i) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i2 = (int) fArr[0];
        if ((i2 & 2) != 2) {
            return 0.0f;
        }
        int i3 = 1 != (i2 & 1) ? 4 : 0;
        int i4 = i - 1;
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? fArr[13 - i3] : fArr[12 - i3] : fArr[11 - i3] : fArr[10 - i3];
    }

    public final void k() {
        Object obj = this.d;
        if (obj instanceof eod) {
            ((eod) obj).a();
        }
    }

    public final long measure(float f, int i, float f2, int i2) {
        long jA;
        int i3;
        int i4;
        if (this.e == null) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        int iA = eob.a(i);
        int iA2 = eob.a(i2);
        Object objF = f();
        int iB = dxu.b(f, iA);
        int iB2 = dxu.b(f2, iA2);
        dvk dvkVar = (dvk) objF;
        if (dvkVar.a.c()) {
            return 0L;
        }
        drq drqVarD = dvkVar.c.d();
        boolean z = ebc.a;
        dxt dxtVar = new dxt(Integer.MIN_VALUE, Integer.MIN_VALUE);
        try {
            try {
                ((dvk) objF).k(iB, iB2, dxtVar);
                i3 = dxtVar.a;
            } catch (Exception e) {
                dxtVar.a = 0;
                dxtVar.b = 0;
                dsq.d(((dvk) objF).c.e(), e);
                jA = eoc.a(0.0f, 0.0f);
            }
            if (i3 >= 0 && (i4 = dxtVar.b) >= 0) {
                dsz dszVar = ((dvk) objF).m;
                if (dszVar != null) {
                    dszVar.g = iB;
                    dszVar.h = iB2;
                    dszVar.e = i3;
                    dszVar.f = i4;
                }
                jA = eoc.a(i3, i4);
                return jA;
            }
            throw new IllegalStateException("MeasureOutput not set, Component is: " + String.valueOf(drqVarD) + " WidthSpec: " + end.a(iB) + " HeightSpec: " + end.a(iB2) + " Measured width : " + dxtVar.a + " Measured Height: " + dxtVar.b);
        } finally {
            dvkVar.j = dxtVar.a;
            dvkVar.k = dxtVar.b;
            dvkVar.h = iB;
            dvkVar.i = iB2;
        }
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.c = j;
    }
}
