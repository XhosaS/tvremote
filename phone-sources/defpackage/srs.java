package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class srs implements srt {
    private Long a;

    @Override // defpackage.srt
    public final boolean a() throws NoSuchMethodException, SecurityException {
        if (this.a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.a = l;
            } catch (Exception unused) {
                this.a = -1L;
            }
        }
        return this.a.longValue() >= 40100;
    }
}
