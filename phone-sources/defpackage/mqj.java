package defpackage;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import com.google.android.videos.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mqj extends mik {
    public lfn t;

    public abstract void b(mqk mqkVar);

    @Override // defpackage.by, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        jwq.V(printWriter);
    }

    @Override // defpackage.mij
    protected final void j() {
        if (!this.t.cJ()) {
            setTheme(R.style.Theme_GoogleTv_Dark);
        } else {
            setTheme(R.style.Theme_GoogleTv_Light);
            new cxe(getWindow(), getWindow().getDecorView()).i(true);
        }
    }

    @Override // defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayOptions(12, 12);
            supportActionBar.setBackgroundDrawable(getDrawable(R.color.play_movies_action_bar_background));
            supportActionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
        }
        cr supportFragmentManager = getSupportFragmentManager();
        if (((gdk) supportFragmentManager.e(android.R.id.content)) == null) {
            mqk mqkVar = new mqk();
            at atVar = new at(supportFragmentManager);
            atVar.w(android.R.id.content, mqkVar);
            atVar.a();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
