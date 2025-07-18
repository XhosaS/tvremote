package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvj implements nzy {
    private final aehf a;

    public mvj(aehf aehfVar) {
        this.a = aehfVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return acxz.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        boolean zContains;
        acxz acxzVar = (acxz) obj;
        oaa oaaVar = (oaa) this.a.a();
        if (acxzVar.c.length() > 0) {
            String str = acxzVar.c;
            Set set = ogy.a;
            synchronized (set) {
                zContains = set.contains(str);
            }
            if (zContains) {
                agff agffVar = agij.a;
                aggz aggzVar = agoh.n;
                return agffVar;
            }
        }
        String str2 = acxzVar.c;
        Set set2 = ogy.a;
        synchronized (set2) {
            set2.add(str2);
        }
        CommandOuterClass$Command defaultInstance = acxzVar.d;
        if (defaultInstance == null) {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        return oaaVar.c(defaultInstance, nzxVar);
    }
}
