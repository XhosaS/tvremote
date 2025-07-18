package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpq {
    public boolean a = false;
    public Float b;
    public Float c;
    public float d;
    public final int e;
    public View f;
    public final int g;
    public final mol h;

    public mpq(mol molVar, int i, int i2) {
        this.h = molVar;
        this.e = i;
        this.g = i2;
    }

    private final float[] d(MotionEvent motionEvent, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new float[]{motionEvent.getRawX(i), motionEvent.getRawY(i)};
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f.getRotation(), this.f.getPivotX(), this.f.getPivotY());
        matrix.postTranslate(this.f.getLeft(), this.f.getTop());
        float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
        matrix.mapPoints(fArr);
        return fArr;
    }

    public final float a(float f, float f2) {
        return f2 >= f ? Math.min(f2 - f, (f + 6.2831855f) - f2) : -a(f2, f);
    }

    public final float b(MotionEvent motionEvent) {
        float[] fArrD = d(motionEvent, motionEvent.getPointerCount() - 1);
        float[] fArrD2 = d(motionEvent, 0);
        return (float) Math.atan2(fArrD[0] - fArrD2[0], fArrD[1] - fArrD2[1]);
    }

    public final float c(MotionEvent motionEvent) {
        float[] fArrD = d(motionEvent, motionEvent.getPointerCount() - 1);
        float[] fArrD2 = d(motionEvent, 0);
        return (float) Math.hypot(fArrD[0] - fArrD2[0], fArrD[1] - fArrD2[1]);
    }
}
