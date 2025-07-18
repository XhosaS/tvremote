package defpackage;

import android.view.MenuItem;
import com.google.android.apps.googletv.app.internal.MaterialBottomNavigationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swg implements ez {
    final /* synthetic */ swj a;

    public swg(swj swjVar) {
        this.a = swjVar;
    }

    @Override // defpackage.ez
    public final boolean onMenuItemSelected(fb fbVar, MenuItem menuItem) {
        swj swjVar = this.a;
        if (swjVar.e == null || menuItem.getItemId() != swjVar.e()) {
            swh swhVar = swjVar.d;
            return (swhVar == null || swhVar.dT(menuItem)) ? false : true;
        }
        MaterialBottomNavigationActivity.$r8$lambda$sGL7XigF3ybZwlw5jwwLvh4JphA((MaterialBottomNavigationActivity) swjVar.e.a, menuItem);
        return true;
    }

    @Override // defpackage.ez
    public final void onMenuModeChange(fb fbVar) {
    }
}
