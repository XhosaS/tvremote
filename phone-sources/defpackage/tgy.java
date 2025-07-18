package defpackage;

import android.view.View;
import com.google.android.apps.googletv.app.internal.MaterialCardActivity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgy implements View.OnLongClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tgy(MaterialCardActivity materialCardActivity, int i) {
        this.b = i;
        this.a = materialCardActivity;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.b != 0) {
            MaterialCardActivity.$r8$lambda$JVjd7E3BKlFxPTUORD2IsYXWUQo((MaterialCardActivity) this.a, view);
            return true;
        }
        tgw tgwVar = ((tgz) this.a).b;
        if (tgwVar == null) {
            return false;
        }
        ArrayList arrayList = tgwVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return false;
            }
            ((tgx) arrayList.get(size)).m();
        }
    }

    public tgy(tgz tgzVar, int i) {
        this.b = i;
        this.a = tgzVar;
    }
}
