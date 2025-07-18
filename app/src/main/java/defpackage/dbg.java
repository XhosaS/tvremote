package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbg implements dax {
    private final ddx a;

    public dbg(ddx ddxVar) {
        this.a = ddxVar;
    }

    @Override // defpackage.dax
    public final /* bridge */ /* synthetic */ day a(Object obj) {
        return new dbh((InputStream) obj, this.a);
    }

    @Override // defpackage.dax
    public final Class b() {
        return InputStream.class;
    }
}
