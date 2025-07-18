package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aot {
    public static /* synthetic */ amb a(aoz aozVar, List list, final ahbt ahbtVar, agum agumVar, int i) {
        if ((i & 4) != 0) {
            list = agrd.a;
        }
        list.getClass();
        anw anwVar = new anw(aozVar, new agux() { // from class: aos
            @Override // defpackage.agux
            public final Object a(Object obj) {
                File file = (File) obj;
                file.getClass();
                return new aor(ahbtVar.fs(), file);
            }
        }, agumVar);
        List listSingletonList = Collections.singletonList(new alv(list, null));
        listSingletonList.getClass();
        return new ano(anwVar, listSingletonList, ahbtVar);
    }
}
