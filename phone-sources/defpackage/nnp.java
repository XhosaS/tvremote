package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nnp implements ndw {
    private final /* synthetic */ int a;

    public /* synthetic */ nnp(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ume] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ndw
    public final Object a(Object obj) {
        umm ummVar;
        ume umeVar;
        int i = this.a;
        if (i == 0) {
            return ((uco) obj).h();
        }
        if (i == 1) {
            return ((wdh) obj).h();
        }
        upo upoVar = (upo) obj;
        aafi aafiVar = icp.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ummVar = new umm(byteArrayOutputStream, aafiVar.b, aafiVar.a, aafiVar.c);
            umeVar = (ume) ummVar.c.get(upoVar.getClass());
        } catch (IOException unused) {
        }
        if (umeVar == null) {
            throw new umc("No encoder for ".concat(String.valueOf(String.valueOf(upoVar.getClass()))));
        }
        umeVar.a(upoVar, ummVar);
        return byteArrayOutputStream.toByteArray();
    }
}
