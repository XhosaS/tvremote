package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class udh extends bq {
    protected final ucg a = new ucg();

    @Override // defpackage.bq
    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ucg ucgVar = this.a;
        uce uceVar = new uce(ucgVar, bundle);
        ucgVar.m(uceVar);
        ucgVar.d = uceVar;
        return null;
    }

    @Override // defpackage.bq
    public void U(Bundle bundle) {
        ucg ucgVar = this.a;
        ucd ucdVar = new ucd(ucgVar, bundle);
        ucgVar.m(ucdVar);
        ucgVar.b = ucdVar;
        this.P = true;
    }

    @Override // defpackage.bq
    public void V(int i, int i2, Intent intent) {
        super.V(i, i2, intent);
        this.a.o();
    }

    @Override // defpackage.bq
    public void W(Activity activity) {
        ucg ucgVar = this.a;
        ucc uccVar = new ucc();
        ucgVar.m(uccVar);
        ucgVar.a = uccVar;
        this.P = true;
    }

    @Override // defpackage.bq
    public void X() {
        this.a.a();
        this.P = true;
    }

    @Override // defpackage.bq
    public void Y() {
        this.a.b();
        this.P = true;
    }

    @Override // defpackage.bq
    public void Z() {
        this.a.h();
        this.P = true;
    }

    @Override // defpackage.bq
    public void aA() {
        this.a.v();
    }

    @Override // defpackage.bq
    public void aa(View view, Bundle bundle) {
        this.a.c(bundle);
    }

    @Override // defpackage.bq
    public final boolean aw() {
        return this.a.q();
    }

    @Override // defpackage.bq
    public final void ax() {
        if (this.a.s()) {
            at();
        }
    }

    @Override // defpackage.bq
    public boolean ay() {
        return this.a.t();
    }

    @Override // defpackage.bq
    public final void az() {
        if (this.a.u()) {
            at();
        }
    }

    @Override // defpackage.bq
    public void e() {
        ucg ucgVar = this.a;
        ucm ucmVar = ucgVar.c;
        int i = 0;
        if (ucmVar != null) {
            ucgVar.l(ucmVar);
            ucgVar.c = null;
        }
        while (true) {
            List list = ucgVar.e;
            if (i >= list.size()) {
                this.P = true;
                return;
            }
            ude udeVar = (ude) list.get(i);
            udeVar.getClass();
            if (udeVar instanceof uby) {
                ((uby) udeVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.bq
    public void er() {
        ucg ucgVar = this.a;
        ucm ucmVar = ucgVar.a;
        int i = 0;
        if (ucmVar != null) {
            ucgVar.l(ucmVar);
            ucgVar.a = null;
        }
        while (true) {
            List list = ucgVar.e;
            if (i >= list.size()) {
                this.P = true;
                return;
            }
            ude udeVar = (ude) list.get(i);
            udeVar.getClass();
            if (udeVar instanceof ubz) {
                ((ubz) udeVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.bq
    public void ey(Bundle bundle) {
        this.a.f(bundle);
        super.ey(bundle);
    }

    @Override // defpackage.bq
    public void g(Bundle bundle) {
        this.a.i(bundle);
    }

    @Override // defpackage.bq
    public void h() {
        this.a.j();
        this.P = true;
    }

    @Override // defpackage.bq
    public void i() {
        this.a.k();
        this.P = true;
    }

    @Override // defpackage.bq, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.p();
        this.P = true;
    }

    @Override // defpackage.bq, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.a.r();
        ef().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.bq, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.a.g();
        this.P = true;
    }
}
