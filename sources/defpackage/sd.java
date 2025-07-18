package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sd {
    private static volatile bfv a;

    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static void b(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static synchronized bfv c(Context context) {
        bzt bztVar;
        bztVar = new bzt(Collections.singletonList(new beo(new asv(context, (byte[]) null))));
        qr qrVar = akm.a;
        return h(bztVar, qr.g(4));
    }

    public static int d(int i) {
        return i - 2;
    }

    public static /* synthetic */ void e(Intent intent, acu acuVar) {
        int i;
        switch (acuVar.e) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case 0:
                throw new IllegalArgumentException("Can't assign unknown extra");
            case 1:
                intent.putExtra(acuVar.d, acuVar.b == 3 ? (String) acuVar.c : "");
                return;
            case 2:
                intent.putExtra(acuVar.d, (byte) (acuVar.b == 4 ? ((Integer) acuVar.c).intValue() : 0));
                return;
            case 3:
                intent.putExtra(acuVar.d, (short) (acuVar.b == 5 ? ((Integer) acuVar.c).intValue() : 0));
                return;
            case 4:
                intent.putExtra(acuVar.d, acuVar.b == 6 ? ((Integer) acuVar.c).intValue() : 0);
                return;
            case 5:
                intent.putExtra(acuVar.d, acuVar.b == 7 ? ((Long) acuVar.c).longValue() : 0L);
                return;
            case 6:
                intent.putExtra(acuVar.d, acuVar.b == 8 ? ((Float) acuVar.c).floatValue() : 0.0f);
                return;
            case 7:
                intent.putExtra(acuVar.d, acuVar.b == 9 ? ((Double) acuVar.c).doubleValue() : 0.0d);
                return;
            case 8:
                intent.putExtra(acuVar.d, acuVar.b == 10 ? ((Boolean) acuVar.c).booleanValue() : false);
                return;
            case 9:
                String[] strArr = new String[acuVar.f.size()];
                for (int i2 = 0; i2 < acuVar.f.size(); i2++) {
                    strArr[i2] = (String) acuVar.f.get(i2);
                }
                intent.putExtra(acuVar.d, strArr);
                return;
            case 10:
                byte[] bArr = new byte[acuVar.g.size()];
                for (int i3 = 0; i3 < acuVar.g.size(); i3++) {
                    bArr[i3] = (byte) acuVar.g.e(i3);
                }
                intent.putExtra(acuVar.d, bArr);
                return;
            case 11:
                short[] sArr = new short[acuVar.h.size()];
                for (int i4 = 0; i4 < acuVar.h.size(); i4++) {
                    sArr[i4] = (short) acuVar.h.e(i4);
                }
                intent.putExtra(acuVar.d, sArr);
                return;
            case 12:
                int[] iArr = new int[acuVar.i.size()];
                for (int i5 = 0; i5 < acuVar.i.size(); i5++) {
                    iArr[i5] = acuVar.i.e(i5);
                }
                intent.putExtra(acuVar.d, iArr);
                return;
            case 13:
                long[] jArr = new long[acuVar.j.size()];
                for (int i6 = 0; i6 < acuVar.j.size(); i6++) {
                    jArr[i6] = acuVar.j.a(i6);
                }
                intent.putExtra(acuVar.d, jArr);
                return;
            case 14:
                float[] fArr = new float[acuVar.k.size()];
                for (int i7 = 0; i7 < acuVar.k.size(); i7++) {
                    fArr[i7] = acuVar.k.e(i7);
                }
                intent.putExtra(acuVar.d, fArr);
                return;
            case 15:
                double[] dArr = new double[acuVar.l.size()];
                for (int i8 = 0; i8 < acuVar.l.size(); i8++) {
                    dArr[i8] = acuVar.l.e(i8);
                }
                intent.putExtra(acuVar.d, dArr);
                return;
            case 16:
                boolean[] zArr = new boolean[acuVar.m.size()];
                for (int i9 = 0; i9 < acuVar.m.size(); i9++) {
                    zArr[i9] = acuVar.m.f(i9);
                }
                intent.putExtra(acuVar.d, zArr);
                return;
            default:
                throw new IllegalArgumentException("Unrecognized extra type");
        }
    }

    public static /* synthetic */ Set f(byg bygVar, crv crvVar) {
        return bygVar.f() ? new cbf((auh) crvVar.a()) : cbd.a;
    }

    public static /* synthetic */ boolean g(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static synchronized bfv h(bzt bztVar, Executor executor) {
        if (a == null) {
            HashMap map = new HashMap();
            wz.e(bfy.a, map);
            a = new bfv(executor, bztVar, map);
        }
        return a;
    }
}
