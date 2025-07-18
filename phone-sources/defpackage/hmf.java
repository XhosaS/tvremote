package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmf implements hlw {
    public final hsl a;

    public hmf(InputStream inputStream, hok hokVar) {
        hsl hslVar = new hsl(inputStream, hokVar);
        this.a = hslVar;
        hslVar.mark(5242880);
    }

    @Override // defpackage.hlw
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.hlw
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        hsl hslVar = this.a;
        hslVar.reset();
        return hslVar;
    }
}
