package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpu extends sbx {
    public final jaf a;
    public final irc b;
    private final dxc c;

    public jpu(dxc dxcVar, irc ircVar, jaf jafVar) {
        ircVar.getClass();
        jafVar.getClass();
        this.c = dxcVar;
        this.b = ircVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jpk jpkVar = new jpk((yfo) this.c.a, 2, (char[]) null);
        jpkVar.b = new jmm(this, ixiVar, 14);
        jpkVar.d = new jnq(this, ixiVar, 10);
        wls wlsVar = ((wsz) ixiVar.b).b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jpkVar.c, wlsVar)) {
            jpkVar.c = wlsVar;
            jpkVar.G(0);
        }
        jpkVar.a = new scc("R.id.info_message_component", jpkVar, new jla((Object) this, ixiVar, 13));
        jpkVar.G(1);
        return jpkVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ((jpk) obj2).F(((ixi) obj).a, new String[0]);
    }
}
