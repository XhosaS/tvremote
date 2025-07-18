package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wlj extends wli {
    protected wlj(Class cls) {
        super(cls);
    }

    @Override // defpackage.wli
    protected final zyd d(Context context, Class cls) {
        try {
            return zxn.h(wgw.a(context, cls));
        } catch (IllegalStateException e) {
            return zxn.g(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
        }
    }
}
