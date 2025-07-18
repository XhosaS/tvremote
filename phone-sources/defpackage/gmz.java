package defpackage;

import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmz {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gmz(Runnable runnable, gju gjuVar, Runnable runnable2) {
        this.b = runnable;
        this.a = gjuVar;
        this.c = runnable2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        ?? r0 = this.b;
        if (r0 != 0) {
            r0.run();
            return;
        }
        ?? r02 = this.c;
        ((gju) this.a).n();
        r02.run();
    }

    public final void b() {
        ki kiVar = (ki) this.a;
        Object obj = this.b;
        List list = (List) kiVar.g(obj);
        if (list != null) {
            list.remove(this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        kiVar.j(obj, list);
    }

    public gmz(Method method, Object obj, Object obj2) {
        this.c = method;
        this.a = obj;
        this.b = obj2;
    }

    public gmz(ki kiVar, String str, yjk yjkVar) {
        this.a = kiVar;
        this.b = str;
        this.c = yjkVar;
    }
}
