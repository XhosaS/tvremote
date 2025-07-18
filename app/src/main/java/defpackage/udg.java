package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class udg extends gf {
    private int l;
    protected final udl m = new udl();

    private final void C() {
        this.l--;
    }

    private final void D() {
        int i = this.l;
        this.l = i + 1;
        if (i != 0) {
            return;
        }
        udl udlVar = this.m;
        int i2 = 0;
        while (true) {
            List list = udlVar.e;
            if (i2 >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i2);
            if (udeVar instanceof ubq) {
                ((ubq) udeVar).a();
            }
            i2++;
        }
    }

    @Override // defpackage.gf, defpackage.gg
    public final void cU(ij ijVar) {
        if (ijVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            List list = this.m.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof udj) {
                ((udj) udeVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.gf, defpackage.gg
    public final void cY() {
        int i = 0;
        while (true) {
            List list = this.m.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof udk) {
                ((udk) udeVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.bw
    public final void da() {
        int i = 0;
        while (true) {
            List list = this.m.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof udi) {
                ((udi) udeVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.gf, defpackage.eq, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                return super.dispatchKeyEvent(keyEvent);
            }
            ude udeVar = (ude) list.get(i);
            if ((udeVar instanceof uav) && ((uav) udeVar).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.finish();
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof uaw) {
                ((uaw) udeVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.finishAfterTransition();
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof uax) {
                ((uax) udeVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        udl udlVar = this.m;
        int i2 = 0;
        while (true) {
            List list = udlVar.e;
            if (i2 >= list.size()) {
                super.onActivityReenter(i, intent);
                return;
            }
            ude udeVar = (ude) list.get(i2);
            if (udeVar instanceof uay) {
                ((uay) udeVar).a();
            }
            i2++;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.m.o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        udl udlVar = this.m;
        ubu ubuVar = new ubu();
        udlVar.m(ubuVar);
        ((ubv) udlVar).d = ubuVar;
        super.onAttachedToWindow();
    }

    @Override // defpackage.tt, android.app.Activity
    public void onBackPressed() {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                this.j.a.c();
                return;
            }
            ude udeVar = (ude) list.get(i);
            if ((udeVar instanceof uba) && ((uba) udeVar).a()) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.gf, defpackage.tt, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.m.p();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.m.q() || super.onContextItemSelected(menuItem);
    }

    @Override // defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.m.f(bundle);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.m.r();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return this.m.s() || super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected void onDestroy() {
        this.m.a();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        udl udlVar = this.m;
        ucm ucmVar = ((ubv) udlVar).d;
        int i = 0;
        if (ucmVar != null) {
            udlVar.l(ucmVar);
            ((ubv) udlVar).d = null;
        }
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.onDetachedFromWindow();
                return;
            }
            ude udeVar = (ude) list.get(i);
            udeVar.getClass();
            if (udeVar instanceof ubb) {
                ((ubb) udeVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                consumer.accept(Collections.EMPTY_LIST);
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubc) {
                ((ubc) udeVar).a();
                return;
            }
            i++;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        udl udlVar = this.m;
        int i2 = 0;
        while (true) {
            List list = udlVar.e;
            if (i2 >= list.size()) {
                return super.onKeyDown(i, keyEvent);
            }
            ude udeVar = (ude) list.get(i2);
            if ((udeVar instanceof ubd) && ((ubd) udeVar).a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        udl udlVar = this.m;
        int i2 = 0;
        while (true) {
            List list = udlVar.e;
            if (i2 >= list.size()) {
                return super.onKeyUp(i, keyEvent);
            }
            ude udeVar = (ude) list.get(i2);
            if ((udeVar instanceof ube) && ((ube) udeVar).a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.m.g();
        super.onLowMemory();
    }

    @Override // defpackage.tt, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubf) {
                ((ubf) udeVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.m.t() || super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onPause() {
        this.m.b();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubg) {
                ((ubg) udeVar).a();
                return;
            }
            i++;
        }
    }

    @Override // defpackage.gf, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        udl udlVar = this.m;
        ubr ubrVar = new ubr(udlVar, bundle);
        udlVar.m(ubrVar);
        udlVar.a = ubrVar;
        super.onPostCreate(bundle);
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected void onPostResume() {
        udl udlVar = this.m;
        ubt ubtVar = new ubt();
        udlVar.m(ubtVar);
        ((ubv) udlVar).c = ubtVar;
        super.onPostResume();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.m.u() || super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.onProvideAssistContent(assistContent);
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubj) {
                ((ubj) udeVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.onProvideAssistData(bundle);
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubk) {
                ((ubk) udeVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.m.v();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        udl udlVar = this.m;
        ubs ubsVar = new ubs(udlVar, bundle);
        udlVar.m(ubsVar);
        ((ubv) udlVar).b = ubsVar;
        super.onRestoreInstanceState(bundle);
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onResume() {
        udm.a(((bw) this).a.a.e);
        this.m.h();
        super.onResume();
    }

    @Override // defpackage.tt, defpackage.eq, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.m.i(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected void onStart() {
        udm.a(((bw) this).a.a.e);
        this.m.j();
        super.onStart();
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected void onStop() {
        this.m.k();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        final udl udlVar = this.m;
        if (!z) {
            ucm ucmVar = udlVar.g;
            int i = 0;
            if (ucmVar != null) {
                udlVar.l(ucmVar);
                udlVar.g = null;
            }
            while (true) {
                List list = udlVar.e;
                if (i >= list.size()) {
                    break;
                }
                udlVar.n((ude) list.get(i));
                i++;
            }
        } else {
            ucm ucmVar2 = new ucm() { // from class: uch
                @Override // defpackage.ucm
                public final void a(ude udeVar) {
                    udlVar.n(udeVar);
                }
            };
            udlVar.m(ucmVar2);
            udlVar.g = ucmVar2;
        }
        super.onTopResumedActivityChanged(z);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.onUserInteraction();
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubn) {
                ((ubn) udeVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    protected final void onUserLeaveHint() {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.onUserLeaveHint();
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubo) {
                ((ubo) udeVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        udl udlVar = this.m;
        int i = 0;
        while (true) {
            List list = udlVar.e;
            if (i >= list.size()) {
                super.onWindowFocusChanged(z);
                return;
            }
            ude udeVar = (ude) list.get(i);
            if (udeVar instanceof ubp) {
                ((ubp) udeVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        D();
        super.startActivity(intent);
        C();
    }

    @Override // defpackage.tt, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        D();
        super.startActivityForResult(intent, i);
        C();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        D();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        C();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        D();
        super.startActivity(intent, bundle);
        C();
    }

    @Override // defpackage.tt, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        D();
        super.startActivityForResult(intent, i, bundle);
        C();
    }
}
