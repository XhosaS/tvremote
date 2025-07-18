package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxj {
    public static final long a = clw.o(0, 0);

    public static final long a(long j) {
        return (yln.v(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (yln.v(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final gzu b(Object obj, bao baoVar) {
        if (obj instanceof gzu) {
            return (gzu) obj;
        }
        gzs gzsVar = new gzs((Context) baoVar.f(AndroidCompositionLocals_androidKt.b));
        gzsVar.a = obj;
        return gzsVar.a();
    }
}
