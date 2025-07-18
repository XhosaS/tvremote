package defpackage;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovj implements eer {
    private final efj a;
    private final tst b;
    private final tst c;

    public ovj(efj efjVar, tst tstVar, tst tstVar2) {
        this.a = efjVar;
        this.b = tstVar;
        this.c = tstVar2;
    }

    @Override // defpackage.eer
    public final ees a() {
        return new nec(this.a.c(), ((Number) this.b.e(Integer.valueOf(WVMediaCrypto.TYPE))).intValue(), ((Boolean) this.c.e(false)).booleanValue());
    }
}
