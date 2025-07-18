package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eof extends YogaNodeJNIBase {
    public eof() {
        super(YogaNative.jni_YGNodeNewJNI());
    }

    protected final void finalize() throws Throwable {
        try {
            long j = this.c;
            if (j != 0) {
                this.c = 0L;
                YogaNative.jni_YGNodeDeallocateJNI(j);
            }
        } finally {
            super.finalize();
        }
    }

    public eof(enu enuVar) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(((env) enuVar).a));
    }
}
