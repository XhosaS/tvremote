package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class onm implements zxe {
    final /* synthetic */ String a;
    final /* synthetic */ acct b;
    final /* synthetic */ Geller c;

    public onm(Geller geller, String str, acct acctVar) {
        this.a = str;
        this.b = acctVar;
        this.c = geller;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) Geller.a.c()).p(th)).q("com/google/android/libraries/geller/portable/Geller$3", "onFailure", (char) 1649, "Geller.java")).u("Unexpected failure invoking storageOperationsCallback.");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iA;
        if (((Long) obj).longValue() > 0) {
            Geller geller = this.c;
            String str = this.a;
            acct acctVar = this.b;
            try {
                int i = acctVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(acctVar.getClass()).a(acctVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(acctVar.getClass()).a(acctVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        acctVar.memoizedSerializedSize = (Integer.MIN_VALUE & acctVar.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(acctVar.getClass()).m(acctVar, abwa.a(abvwVar));
                abvwVar.K();
                geller.g.onDeletion(str, bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.u(acctVar, " to a byte array threw an IOException (should never happen)."), e);
            }
        }
    }
}
