package defpackage;

import com.google.android.libraries.assistant.soda.data.SodaDataProviderJni;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mcb implements zxe {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ SodaDataProviderJni c;

    public mcb(SodaDataProviderJni sodaDataProviderJni, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = sodaDataProviderJni;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        int iA;
        adpf adpfVar = adpf.a;
        adoy adoyVar = new adoy();
        adpc adpcVar = adpc.a;
        adpb adpbVar = new adpb();
        String message = th.getMessage();
        if ((adpbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adpbVar.y();
        }
        adpc adpcVar2 = (adpc) adpbVar.b;
        message.getClass();
        adpcVar2.b = 1;
        adpcVar2.c = message;
        if ((adoyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adoyVar.y();
        }
        adpf adpfVar2 = (adpf) adoyVar.b;
        adpc adpcVar3 = (adpc) adpbVar.v();
        adpcVar3.getClass();
        adpfVar2.c = adpcVar3;
        adpfVar2.b = 1;
        adpf adpfVar3 = (adpf) adoyVar.v();
        SodaDataProviderJni sodaDataProviderJni = this.c;
        sodaDataProviderJni.b.readLock().lock();
        try {
            if (sodaDataProviderJni.c) {
                ((zdv) ((zdv) SodaDataProviderJni.a.d()).q("com/google/android/libraries/assistant/soda/data/SodaDataProviderJni$1", "onFailure", 62, "SodaDataProviderJni.java")).x("Ignoring failed DataResponse because SODA has shut down. Failure reason: %s", th.getMessage());
            } else {
                long j = this.a;
                long j2 = this.b;
                try {
                    int i = adpfVar3.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(adpfVar3.getClass()).a(adpfVar3);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(adpfVar3.getClass()).a(adpfVar3);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            adpfVar3.memoizedSerializedSize = (adpfVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(adpfVar3.getClass()).m(adpfVar3, abwa.a(abvwVar));
                    abvwVar.K();
                    sodaDataProviderJni.nativeHandleDataResponse(j, j2, bArr);
                } catch (IOException e) {
                    throw new RuntimeException(a.C(adpfVar3, "byte array"), e);
                }
            }
        } finally {
            this.c.b.readLock().unlock();
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int iA;
        adpf adpfVar = (adpf) obj;
        SodaDataProviderJni sodaDataProviderJni = this.c;
        sodaDataProviderJni.b.readLock().lock();
        try {
            if (sodaDataProviderJni.c) {
                ((zdv) ((zdv) SodaDataProviderJni.a.d()).q("com/google/android/libraries/assistant/soda/data/SodaDataProviderJni$1", "onSuccess", 44, "SodaDataProviderJni.java")).u("Ignoring DataResponse because SODA has shut down.");
            } else {
                long j = this.a;
                long j2 = this.b;
                try {
                    int i = adpfVar.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(adpfVar.getClass()).a(adpfVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(adpfVar.getClass()).a(adpfVar);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            adpfVar.memoizedSerializedSize = (Integer.MIN_VALUE & adpfVar.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(adpfVar.getClass()).m(adpfVar, abwa.a(abvwVar));
                    abvwVar.K();
                    sodaDataProviderJni.nativeHandleDataResponse(j, j2, bArr);
                } catch (IOException e) {
                    throw new RuntimeException(a.C(adpfVar, "byte array"), e);
                }
            }
        } finally {
            this.c.b.readLock().unlock();
        }
    }
}
