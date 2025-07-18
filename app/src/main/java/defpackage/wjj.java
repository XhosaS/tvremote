package defpackage;

import android.os.Bundle;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjj extends aeik {
    public wjj(bq bqVar) {
        super(bqVar);
    }

    public static final void a(bq bqVar, MessageLite messageLite) {
        aeik.d(bqVar);
        Bundle bundle = bqVar.n;
        messageLite.getClass();
        acas.b(bundle, "TIKTOK_FRAGMENT_ARGUMENT", messageLite);
    }

    @Override // defpackage.aeik
    protected final void b(bq bqVar) {
        Class<?> cls = bqVar.getClass();
        bw bwVarEe = bqVar.ee();
        cls.getSimpleName();
        bwVarEe.getClass();
        yqw.ai(bqVar.ee() instanceof wip, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", bqVar.getClass().getSimpleName(), bqVar.ee().getClass().getSimpleName());
    }
}
