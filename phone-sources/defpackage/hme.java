package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hme implements hlv {
    private final hok a;

    public hme(hok hokVar) {
        this.a = hokVar;
    }

    @Override // defpackage.hlv
    public final /* bridge */ /* synthetic */ hlw a(Object obj) {
        return new hmf((InputStream) obj, this.a);
    }

    @Override // defpackage.hlv
    public final Class b() {
        return InputStream.class;
    }
}
