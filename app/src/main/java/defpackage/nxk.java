package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxk implements oco {
    private final agow a;

    public nxk(agow agowVar) {
        this.a = agowVar;
    }

    @Override // defpackage.oco
    public final /* synthetic */ void a(acwg acwgVar, String str, Object... objArr) {
        ocn.a(this, acwgVar, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void b(acsw acswVar, oal oalVar, String str, Object... objArr) {
        d(acswVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void c(acwg acwgVar, oal oalVar, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final void d(acsw acswVar, oal oalVar, Throwable th, String str, Object... objArr) {
        int iA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = String.format(str, objArr);
        abzy abzyVar = abzy.a;
        abzx abzxVar = new abzx();
        long j = jCurrentTimeMillis / 1000;
        if ((abzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar.y();
        }
        ((abzy) abzxVar.b).b = j;
        long j2 = jCurrentTimeMillis % 1000;
        if ((abzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzxVar.y();
        }
        ((abzy) abzxVar.b).c = (int) (j2 * 1000000);
        abzy abzyVar2 = (abzy) abzxVar.v();
        int i = acswVar == acsw.LOG_LEVEL_WARN ? 3 : 4;
        adaq adaqVar = adaq.a;
        adap adapVar = new adap();
        if ((adapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adapVar.y();
        }
        adaq adaqVar2 = (adaq) adapVar.b;
        adaqVar2.e = i - 1;
        adaqVar2.b |= 4;
        String strName = acswVar.name();
        if ((adapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adapVar.y();
        }
        adaq adaqVar3 = (adaq) adapVar.b;
        strName.getClass();
        adaqVar3.b |= 8;
        adaqVar3.f = strName;
        if ((adapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adapVar.y();
        }
        adaq adaqVar4 = (adaq) adapVar.b;
        str2.getClass();
        adaqVar4.b |= 1;
        adaqVar4.c = str2;
        if ((adapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adapVar.y();
        }
        adaq adaqVar5 = (adaq) adapVar.b;
        abzyVar2.getClass();
        adaqVar5.d = abzyVar2;
        adaqVar5.b |= 2;
        if (th != null) {
            String str3 = str2 + "\n" + th.toString();
            if ((adapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adapVar.y();
            }
            adaq adaqVar6 = (adaq) adapVar.b;
            adaqVar6.b |= 1;
            adaqVar6.c = str3;
            adat adatVar = adat.a;
            adas adasVar = new adas();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                adan adanVar = adan.a;
                adam adamVar = new adam();
                String str4 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                if ((adamVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adamVar.y();
                }
                adan adanVar2 = (adan) adamVar.b;
                adanVar2.b |= 1;
                adanVar2.c = str4;
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber >= 0) {
                    if ((adamVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adamVar.y();
                    }
                    adan adanVar3 = (adan) adamVar.b;
                    adanVar3.b |= 4;
                    adanVar3.e = lineNumber;
                }
                String fileName = stackTraceElement.getFileName();
                if (fileName != null) {
                    if ((adamVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adamVar.y();
                    }
                    adan adanVar4 = (adan) adamVar.b;
                    adanVar4.b |= 2;
                    adanVar4.d = fileName;
                }
                adan adanVar5 = (adan) adamVar.v();
                if ((adasVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adasVar.y();
                }
                adat adatVar2 = (adat) adasVar.b;
                adanVar5.getClass();
                abxs abxsVar = adatVar2.b;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    adatVar2.b = abxsVar.d(size + size);
                }
                adatVar2.b.add(adanVar5);
            }
            adat adatVar3 = (adat) adasVar.v();
            if ((adapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adapVar.y();
            }
            adaq adaqVar7 = (adaq) adapVar.b;
            adatVar3.getClass();
            adaqVar7.g = adatVar3;
            adaqVar7.b |= 16;
        }
        DebuggerClient debuggerClient = (DebuggerClient) this.a.a();
        adaq adaqVar8 = (adaq) adapVar.v();
        try {
            int i2 = adaqVar8.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(adaqVar8.getClass()).a(adaqVar8);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(adaqVar8.getClass()).a(adaqVar8);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    adaqVar8.memoizedSerializedSize = (adaqVar8.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(adaqVar8.getClass()).m(adaqVar8, abwa.a(abvwVar));
            abvwVar.K();
            debuggerClient.sendLog(bArr);
            if (th == null || th.getCause() == null) {
                return;
            }
            d(acswVar, oalVar, th.getCause(), "Caused by:", new Object[0]);
        } catch (IOException e) {
            throw new RuntimeException(a.u(adaqVar8, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.oco
    public final /* synthetic */ void e(acwg acwgVar, oal oalVar, Throwable th, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, th, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void f(acwg acwgVar, Throwable th, Object... objArr) {
        ocn.c(this, acwgVar, th, objArr);
    }
}
