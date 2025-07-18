package defpackage;

import java.io.File;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dgq implements dhe {
    private final dgn a;

    public dgq(dgn dgnVar) {
        this.a = dgnVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        File file = (File) obj;
        return new dhd(new dpt(file), Collections.EMPTY_LIST, new dgm(file, this.a));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
