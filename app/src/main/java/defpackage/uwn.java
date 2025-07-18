package defpackage;

import com.google.protobuf.MessageLite;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwn implements mox {
    private static final zfh a = zfh.h("IsolatedContainerCnvrtr");

    @Override // defpackage.mox
    public final /* bridge */ /* synthetic */ drn a(dru druVar, oal oalVar, MessageLite messageLite, List list) {
        adew adewVar = (adew) messageLite;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("isolated_container() must have exactly 1 child");
        }
        if (list.size() > 1) {
            ((zfd) ((zfd) a.d()).q("com/google/android/libraries/tv/xuikit/isolatedcontainer/IsolatedContainerConverter", "create", 47, "IsolatedContainerConverter.java")).u("isolated_container() was given more than 1 child. isolated_container() will only render the first child.");
        }
        ejw ejwVar = new ejw(new dru(druVar.a, druVar.j(), druVar.o(), dzh.b(druVar.f)), new ejy());
        boolean z = adewVar.c;
        ejy ejyVar = ejwVar.a;
        ejyVar.b = z;
        drq drqVar = (drq) list.get(0);
        ejyVar.a = drqVar == null ? null : drqVar.l();
        ejwVar.d.set(0);
        return ejwVar;
    }
}
