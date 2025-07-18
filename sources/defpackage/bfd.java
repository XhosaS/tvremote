package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfd implements bem {
    private final cng a;
    private final cli b;

    private bfd(cng cngVar) {
        cli cliVar = cli.a;
        cni cniVar = cni.a;
        this.b = cli.a;
        this.a = cngVar;
    }

    public static bfd b(cmz cmzVar) {
        return new bfd(cmzVar.u());
    }

    @Override // defpackage.bem
    public final /* bridge */ /* synthetic */ Object a(cmt cmtVar) throws IOException {
        InputStream inputStreamB = bfe.b(cmtVar);
        try {
            Object objA = this.a.a(inputStreamB, this.b);
            if (inputStreamB != null) {
                inputStreamB.close();
            }
            return objA;
        } catch (Throwable th) {
            if (inputStreamB != null) {
                try {
                    inputStreamB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
