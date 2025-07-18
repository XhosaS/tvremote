package defpackage;

import com.google.common.collect.Sets;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vts {
    public static vto n(Class cls) {
        vtb vtbVar = new vtb();
        vtbVar.a = cls;
        caq caqVar = caq.a;
        if (caqVar == null) {
            throw new NullPointerException("Null constraints");
        }
        vtbVar.b = caqVar;
        vtbVar.c = new vte(0L, TimeUnit.SECONDS);
        vtbVar.h = yzq.o(zcp.b);
        vtbVar.e = cav.a(new LinkedHashMap());
        return vtbVar;
    }

    public abstract caq a();

    public abstract caz b();

    public abstract vto c();

    public abstract vtq d();

    public abstract yqt e();

    public abstract yqt f();

    public abstract yqt g();

    public abstract yqt h();

    public abstract yqt i();

    public abstract yqt j();

    public abstract yqt k();

    public abstract yzq l();

    public abstract Class m();

    public final vts o(Set set) {
        vto vtoVarC = c();
        ((vtb) vtoVarC).h = yzq.o(Sets.d(l(), set));
        return vtoVarC.b();
    }
}
