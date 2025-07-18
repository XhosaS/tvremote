package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtm implements dtn {
    public static final int a = 9;
    public float[] b;
    private long c = -1;
    private boolean d;

    @Override // defpackage.dtn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        dtm dtmVar = (dtm) obj;
        if (this == dtmVar) {
            return true;
        }
        return dtmVar != null && this.c == dtmVar.c && this.d == dtmVar.d && Arrays.equals(this.b, dtmVar.b);
    }

    public final byte b(int i) {
        return (byte) ((this.c >> (i * 4)) & 15);
    }

    public final float c(int i) {
        byte b = b(i);
        if (b == 15) {
            return Float.NaN;
        }
        return this.b[b];
    }

    public final float d(int i) {
        if (this.c == -1) {
            return 0.0f;
        }
        byte b = b(i - 1);
        if (b != 15) {
            return this.b[b];
        }
        if (!this.d) {
            return 0.0f;
        }
        int i2 = 7;
        if (i != 2 && i != 4) {
            i2 = 6;
        }
        byte b2 = b(i2);
        if (b2 != 15) {
            return this.b[b2];
        }
        if (b(8) != 15) {
            return this.b[b(8)];
        }
        return 0.0f;
    }

    public final void e(int i, float f) {
        byte b;
        int i2 = i - 1;
        float fC = c(i2);
        if (Float.isNaN(fC) || Float.isNaN(f)) {
            if (Float.isNaN(fC) && Float.isNaN(f)) {
                return;
            }
        } else if (Math.abs(f - fC) < 1.0E-5f) {
            return;
        }
        byte b2 = b(i2);
        if (enx.a(f)) {
            this.c = (15 << (i2 * 4)) | this.c;
            this.b[b2] = Float.NaN;
        } else if (b2 == 15) {
            if (this.b != null) {
                int i3 = 0;
                while (true) {
                    float[] fArr = this.b;
                    int length = fArr.length;
                    if (i3 >= length) {
                        float[] fArr2 = new float[Math.min(length + length, 9)];
                        this.b = fArr2;
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                        float[] fArr3 = this.b;
                        Arrays.fill(fArr3, length, fArr3.length, Float.NaN);
                        b = (byte) length;
                        break;
                    }
                    if (enx.a(fArr[i3])) {
                        b = (byte) i3;
                        break;
                    }
                    i3++;
                }
            } else {
                this.b = new float[]{Float.NaN, Float.NaN};
                b = 0;
            }
            if (b >= 9) {
                throw new IllegalStateException("The newIndex for the array cannot be bigger than the amount of Yoga Edges.");
            }
            int i4 = i2 * 4;
            this.c = ((~(15 << i4)) & this.c) | (b << i4);
            this.b[b] = f;
        } else {
            this.b[b2] = f;
        }
        this.d = ((~((int) (this.c >> 24))) & 4095) != 0;
    }
}
