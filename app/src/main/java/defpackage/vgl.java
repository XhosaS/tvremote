package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgl implements vgh, bbv {
    public static final vgk a = new vgk();
    public static final zdy b = zdy.h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked");
    private final wit c;
    private final vgd d;
    private final agpc e;

    public vgl(wit witVar, vgd vgdVar, vgv vgvVar, wii wiiVar) {
        witVar.getClass();
        vgdVar.getClass();
        vgvVar.getClass();
        wiiVar.getClass();
        this.c = witVar;
        this.d = vgdVar;
        agwj agwjVar = agwi.a;
        this.e = new bec(new agvq(vgq.class), new vgm(witVar), new vgn(witVar), new vgo(witVar));
        new ArrayList();
        Boolean bool = false;
        bool.getClass();
        witVar.ek().b(this);
    }

    private final vgq h() {
        return (vgq) this.e.a();
    }

    @Override // defpackage.bbv
    public final void eY(bcl bclVar) {
        boolean z = h().e && h().d;
        h().d = false;
        if (z) {
            vgq vgqVarH = h();
            vgqVarH.a = -1;
            vhg vhgVar = vhg.a;
            vhgVar.getClass();
            vgqVarH.b = vhgVar;
            vgqVarH.c = 0;
            a.a(this.c.eE());
            return;
        }
        int i = h().c;
        if (i != 0) {
            if (i == 1) {
                this.d.c();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
                this.d.b();
            } else {
                vgd vgdVar = this.d;
                AccountId.b(g());
                vgdVar.a(h().b);
            }
        }
    }

    @Override // defpackage.vgh
    public final int g() {
        uea.c();
        return h().a;
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void b(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void c(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void d(bcl bclVar) {
    }
}
