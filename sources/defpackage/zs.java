package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zs {
    final zl a;
    final int b;
    final zu c;
    final List d;
    private final boolean e;
    private final zu f;
    private final zu g;
    private final WeakReference h;
    private boolean i = false;
    private boolean j = false;

    public zs(yv yvVar, zu zuVar, zl zlVar, int i, boolean z, zu zuVar2, Collection collection) {
        this.h = new WeakReference(yvVar);
        this.c = zuVar;
        this.a = zlVar;
        this.b = i;
        this.e = z;
        this.f = yvVar.d;
        this.g = zuVar2;
        this.d = collection == null ? null : new ArrayList(collection);
        yvVar.a.postDelayed(new ki(this, 15), 15000L);
    }

    final void a() {
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        zl zlVar = this.a;
        if (zlVar != null) {
            zlVar.i(0);
            zlVar.a();
        }
    }

    public final void b() {
        zr zrVarE;
        zu zuVar;
        zv.c();
        if (this.i || this.j) {
            return;
        }
        WeakReference weakReference = this.h;
        yv yvVar = (yv) weakReference.get();
        if (yvVar == null || yvVar.f != this) {
            a();
            return;
        }
        this.i = true;
        yvVar.f = null;
        yv yvVar2 = (yv) weakReference.get();
        if (yvVar2 != null && yvVar2.d == (zuVar = this.f)) {
            yt ytVar = yvVar2.a;
            int i = this.b;
            Message messageObtainMessage = ytVar.obtainMessage(263, zuVar);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            zl zlVar = yvVar2.e;
            if (zlVar != null) {
                zlVar.i(i);
                yvVar2.e.a();
            }
            Map map = yvVar2.b;
            if (!map.isEmpty()) {
                for (zl zlVar2 : map.values()) {
                    zlVar2.i(i);
                    zlVar2.a();
                }
                map.clear();
            }
            yvVar2.e = null;
        }
        yv yvVar3 = (yv) weakReference.get();
        if (yvVar3 != null) {
            zu zuVar2 = this.c;
            yvVar3.d = zuVar2;
            yvVar3.e = this.a;
            zu zuVar3 = this.g;
            if (zuVar3 == null) {
                yvVar3.a.b(this.f, zuVar2, this.b, this.e);
            } else {
                yt ytVar2 = yvVar3.a;
                int i2 = this.b;
                Message messageObtainMessage2 = ytVar2.obtainMessage(264, new byl(zuVar3, zuVar2, this.e));
                messageObtainMessage2.arg1 = i2;
                messageObtainMessage2.sendToTarget();
            }
            yvVar3.b.clear();
            yvVar3.h();
            yvVar3.m();
            List list = this.d;
            if (list == null || (zrVarE = yvVar3.d.e()) == null) {
                return;
            }
            zrVarE.a(list);
        }
    }
}
