package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuv {
    final fun a;
    final int b;
    final fux c;
    final List d;
    private final boolean e;
    private final fux f;
    private final fux g;
    private final WeakReference h;
    private boolean i = false;
    private boolean j = false;

    public fuv(ftw ftwVar, fux fuxVar, fun funVar, int i, boolean z, fux fuxVar2, Collection collection) {
        this.h = new WeakReference(ftwVar);
        this.c = fuxVar;
        this.a = funVar;
        this.b = i;
        this.e = z;
        this.f = ftwVar.d;
        this.g = fuxVar2;
        this.d = collection == null ? null : new ArrayList(collection);
        ftwVar.a.postDelayed(new foe(this, 14), 15000L);
    }

    final void a() {
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        fun funVar = this.a;
        if (funVar != null) {
            funVar.n(0);
            funVar.b();
        }
    }

    public final void b() {
        fuu fuuVarJ;
        fux fuxVar;
        fuy.e();
        if (this.i || this.j) {
            return;
        }
        WeakReference weakReference = this.h;
        ftw ftwVar = (ftw) weakReference.get();
        if (ftwVar == null || ftwVar.f != this) {
            a();
            return;
        }
        this.i = true;
        ftwVar.f = null;
        ftw ftwVar2 = (ftw) weakReference.get();
        if (ftwVar2 != null && ftwVar2.d == (fuxVar = this.f)) {
            fts ftsVar = ftwVar2.a;
            int i = this.b;
            Message messageObtainMessage = ftsVar.obtainMessage(263, fuxVar);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            fun funVar = ftwVar2.e;
            if (funVar != null) {
                funVar.n(i);
                ftwVar2.e.b();
            }
            Map map = ftwVar2.b;
            if (!map.isEmpty()) {
                for (fun funVar2 : map.values()) {
                    funVar2.n(i);
                    funVar2.b();
                }
                map.clear();
            }
            ftwVar2.e = null;
        }
        ftw ftwVar3 = (ftw) weakReference.get();
        if (ftwVar3 != null) {
            fux fuxVar2 = this.c;
            ftwVar3.d = fuxVar2;
            ftwVar3.e = this.a;
            fux fuxVar3 = this.g;
            if (fuxVar3 == null) {
                ftwVar3.a.b(this.f, fuxVar2, this.b, this.e);
            } else {
                fts ftsVar2 = ftwVar3.a;
                int i2 = this.b;
                Message messageObtainMessage2 = ftsVar2.obtainMessage(264, new uof(fuxVar3, fuxVar2, this.e));
                messageObtainMessage2.arg1 = i2;
                messageObtainMessage2.sendToTarget();
            }
            ftwVar3.b.clear();
            ftwVar3.i();
            ftwVar3.o();
            List list = this.d;
            if (list == null || (fuuVarJ = ftwVar3.d.j()) == null) {
                return;
            }
            fuuVarJ.a(list);
        }
    }
}
