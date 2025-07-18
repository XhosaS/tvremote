package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bab implements bad {
    public final Object a;
    public Object b;
    private final ArrayList c = new ArrayList();

    public bab(Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.bad
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.bad
    public final /* synthetic */ void b(yjz yjzVar, Object obj) {
        yjzVar.a(a(), obj);
    }

    @Override // defpackage.bad
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.bad
    public final void d(Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.bad
    public /* synthetic */ void g() {
        Object objA = a();
        bak bakVar = objA instanceof bak ? (bak) objA : null;
        if (bakVar != null) {
            bakVar.c();
        }
    }

    @Override // defpackage.bad
    public final void h() {
        this.b = bdx.a(this.c);
    }

    @Override // defpackage.bad
    public /* synthetic */ void f() {
    }
}
