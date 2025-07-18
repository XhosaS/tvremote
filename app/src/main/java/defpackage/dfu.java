package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfu implements dhe {
    private final dfq a;

    public dfu(dfq dfqVar) {
        this.a = dfqVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        byte[] bArr = (byte[]) obj;
        return new dhd(new dpt(bArr), Collections.EMPTY_LIST, new dfr(bArr, this.a));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
