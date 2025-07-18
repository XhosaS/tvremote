package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aflw {
    private int a;
    private int b = 1;
    public final afla c;
    public final int d;
    public final afzw e;
    public boolean f;
    public boolean g;

    public aflw(afla aflaVar, int i, afzw afzwVar) {
        this.c = aflaVar;
        this.d = i;
        this.e = afzwVar;
    }

    private final void d(int i) {
        int i2 = this.b;
        int i3 = i - 1;
        if (i3 == 1) {
            yqw.L(i2 == 1);
        } else if (i3 == 2) {
            yqw.L(i2 == 2);
        } else if (i3 == 3) {
            yqw.L(i2 == 3);
        }
        this.b = i;
    }

    protected abstract int a(Parcel parcel);

    protected abstract void b(Parcel parcel);

    final void c() throws StatusException {
        while (true) {
            int i = this.b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            int iA = 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2 || !this.g) {
                        return;
                    }
                } else if (!this.g) {
                    return;
                }
            } else if (!this.f) {
                return;
            }
            afla aflaVar = this.c;
            if (!aflaVar.n()) {
                return;
            }
            try {
                try {
                    aflx aflxVarB = aflx.b();
                    try {
                        int i3 = 0;
                        aflxVarB.a().writeInt(0);
                        Parcel parcelA = aflxVarB.a();
                        int i4 = this.a;
                        this.a = i4 + 1;
                        parcelA.writeInt(i4);
                        int i5 = this.b;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 == 0) {
                            b(aflxVarB.a());
                            d(2);
                            if (!this.g) {
                            }
                            afma.b(aflxVarB.a(), iA);
                            int iDataSize = aflxVarB.a().dataSize();
                            aflaVar.k(this.d, aflxVarB);
                            afzw afzwVar = this.e;
                            afzwVar.c(iDataSize);
                            afzwVar.g();
                            aflxVarB.close();
                        } else if (i6 == 1) {
                            iA = 0;
                        } else {
                            if (i6 != 2) {
                                throw new AssertionError();
                            }
                            iA = i3 | 4 | a(aflxVarB.a());
                            d(4);
                            afma.b(aflxVarB.a(), iA);
                            int iDataSize2 = aflxVarB.a().dataSize();
                            aflaVar.k(this.d, aflxVarB);
                            afzw afzwVar2 = this.e;
                            afzwVar2.c(iDataSize2);
                            afzwVar2.g();
                            aflxVarB.close();
                        }
                        yqw.L(this.g);
                        if (this.g) {
                            d(3);
                            i3 = iA;
                            iA = i3 | 4 | a(aflxVarB.a());
                            d(4);
                        }
                        afma.b(aflxVarB.a(), iA);
                        int iDataSize22 = aflxVarB.a().dataSize();
                        aflaVar.k(this.d, aflxVarB);
                        afzw afzwVar22 = this.e;
                        afzwVar22.c(iDataSize22);
                        afzwVar22.g();
                        aflxVarB.close();
                    } catch (Throwable th) {
                        try {
                            aflxVarB.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw Status.k.c(e).asException();
                }
            } catch (StatusException e2) {
                d(5);
                throw e2;
            }
        }
    }

    public final synchronized String toString() {
        String simpleName;
        int i;
        simpleName = getClass().getSimpleName();
        i = this.b;
        return simpleName + "[S=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=0]";
    }
}
