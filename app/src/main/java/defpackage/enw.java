package defpackage;

import com.facebook.yoga.YogaNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public class enw extends env {
    public enw() {
        super(YogaNative.jni_YGConfigNewJNI());
    }

    protected final void finalize() throws Throwable {
        try {
            long j = this.a;
            if (j != 0) {
                this.a = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
