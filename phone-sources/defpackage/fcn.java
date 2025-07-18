package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcn implements SensorEventListener {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final float[] c = new float[16];
    private final float[] d = new float[3];
    private final Display e;
    private final fcm[] f;
    private boolean g;

    public fcn(Display display, fcm... fcmVarArr) {
        this.e = display;
        this.f = fcmVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = this.a;
        SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
        int rotation = this.e.getRotation();
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i2 = 2;
            }
            float[] fArr2 = this.b;
            System.arraycopy(fArr, 0, fArr2, 0, 16);
            SensorManager.remapCoordinateSystem(fArr2, i2, i, fArr);
        }
        float[] fArr3 = this.b;
        SensorManager.remapCoordinateSystem(fArr, 1, 131, fArr3);
        float[] fArr4 = this.d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        if (!this.g) {
            mma.h(this.c, fArr);
            this.g = true;
        }
        System.arraycopy(fArr, 0, fArr3, 0, 16);
        Matrix.multiplyMM(fArr, 0, fArr3, 0, this.c, 0);
        fcm[] fcmVarArr = this.f;
        for (int i3 = 0; i3 < 2; i3++) {
            fcmVarArr[i3].a(fArr, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
