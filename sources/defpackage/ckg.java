package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ckg implements cng {
    static {
        cli cliVar = cli.a;
        cni cniVar = cni.a;
    }

    private static final void e(cmz cmzVar) throws cmh {
        if (cmzVar != null && !cmzVar.m()) {
            throw new cnw().a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [cmz, java.lang.Object] */
    @Override // defpackage.cng
    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream, cli cliVar) throws cmh {
        cky ckyVarK = cky.K(inputStream);
        ?? D = d(ckyVarK, cliVar);
        ckyVarK.z(0);
        e(D);
        return D;
    }

    @Override // defpackage.cng
    public final /* bridge */ /* synthetic */ Object b(byte[] bArr, int i, cli cliVar) throws cmh {
        cmz cmzVarC = c(bArr, i, cliVar);
        e(cmzVarC);
        return cmzVarC;
    }

    public cmz c(byte[] bArr, int i, cli cliVar) {
        throw null;
    }
}
