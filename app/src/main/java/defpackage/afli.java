package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afli extends afll {
    private final afkz g;

    public afli(afkz afkzVar, afeh afehVar, int i) {
        super(afkzVar, afehVar, i);
        this.g = afkzVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afzl, afzz] */
    @Override // defpackage.afll
    protected final void a(Status status) {
        this.f.b(status);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afzl, afzz] */
    @Override // defpackage.afll
    protected final void b() {
        this.f.c();
    }

    @Override // defpackage.afll
    public final void c(int i, Parcel parcel) throws StatusException {
        afih afihVar;
        afzw afzwVar;
        afeh afehVar = this.b;
        String string = parcel.readString();
        int i2 = parcel.readInt();
        if (i2 == 0) {
            afihVar = new afih();
        } else {
            Object[] objArr = new Object[i2 + i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = parcel.readInt();
                int i6 = i3 + 4;
                byte[] bArrB = aflo.b(parcel, i5, i6);
                int i7 = i6 + i5;
                int i8 = i4 + i4;
                objArr[i8] = bArrB;
                int i9 = parcel.readInt();
                if (i9 == -1) {
                    throw Status.f.withDescription("Parcelable metadata values not allowed").asException();
                }
                if (i9 < 0) {
                    throw Status.k.withDescription("Unrecognized metadata sentinel").asException();
                }
                int i10 = i7 + 4;
                byte[] bArrB2 = aflo.b(parcel, i9, i10);
                i3 = i10 + i9;
                objArr[i8 + 1] = bArrB2;
            }
            Charset charset = afgt.a;
            afihVar = new afih(i2, objArr);
        }
        afkz afkzVar = this.g;
        afzw afzwVar2 = afzw.a;
        List list = afkzVar.a;
        if (list.isEmpty()) {
            afzwVar = afzw.a;
        } else {
            int size = list.size();
            afjy[] afjyVarArr = new afjy[size];
            for (int i11 = 0; i11 < size; i11++) {
                afjyVarArr[i11] = ((afjo) list.get(i11)).a();
            }
            afzwVar = new afzw(afjyVarArr);
        }
        aflv aflvVar = new aflv(afkzVar, this.c, afzwVar);
        Status statusB = afkzVar.b((i & 16) != 0 ? new aflz(this, aflvVar, afehVar) : new aflp(this, aflvVar, afehVar), string, afihVar);
        if (!statusB.e()) {
            super.f(statusB, statusB, false);
            return;
        }
        this.f.getClass();
        if (this.a.n()) {
            this.f.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [afzl, afzz] */
    final void d() {
        if (k()) {
            return;
        }
        j(aflj.CLOSED);
        this.e.i();
        this.f.b(Status.OK);
    }
}
