package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nng extends ifk implements IInterface {
    private final nnn a;
    private final Class b;

    public nng() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        nnn nnnVar;
        nnn nnnVar2;
        nnn nnnVar3;
        nnn nnnVar4;
        nnn nnnVar5;
        nnn nnnVar6;
        nnn nnnVar7;
        nnn nnnVar8;
        nnn nnnVar9;
        odd odbVar = null;
        switch (i) {
            case 1:
                odc odcVar = new odc(this.a);
                parcel2.writeNoException();
                ifl.e(parcel2, odcVar);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface instanceof odd ? (odd) iInterfaceQueryLocalInterface : new odb(strongBinder);
                }
                ifl.b(parcel);
                nnl nnlVar = (nnl) odc.a(odbVar);
                Class cls = this.b;
                if (cls.isInstance(nnlVar) && (nnnVar = this.a) != null) {
                    nnnVar.h((nnl) cls.cast(nnlVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface2 instanceof odd ? (odd) iInterfaceQueryLocalInterface2 : new odb(strongBinder2);
                }
                String string = parcel.readString();
                ifl.b(parcel);
                nnl nnlVar2 = (nnl) odc.a(odbVar);
                Class cls2 = this.b;
                if (cls2.isInstance(nnlVar2) && (nnnVar2 = this.a) != null) {
                    nnnVar2.g((nnl) cls2.cast(nnlVar2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface3 instanceof odd ? (odd) iInterfaceQueryLocalInterface3 : new odb(strongBinder3);
                }
                int i2 = parcel.readInt();
                ifl.b(parcel);
                nnl nnlVar3 = (nnl) odc.a(odbVar);
                Class cls3 = this.b;
                if (cls3.isInstance(nnlVar3) && (nnnVar3 = this.a) != null) {
                    nnnVar3.f((nnl) cls3.cast(nnlVar3), i2);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface4 instanceof odd ? (odd) iInterfaceQueryLocalInterface4 : new odb(strongBinder4);
                }
                ifl.b(parcel);
                nnl nnlVar4 = (nnl) odc.a(odbVar);
                Class cls4 = this.b;
                if (cls4.isInstance(nnlVar4) && (nnnVar4 = this.a) != null) {
                    nnnVar4.b((nnl) cls4.cast(nnlVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface5 instanceof odd ? (odd) iInterfaceQueryLocalInterface5 : new odb(strongBinder5);
                }
                int i3 = parcel.readInt();
                ifl.b(parcel);
                nnl nnlVar5 = (nnl) odc.a(odbVar);
                Class cls5 = this.b;
                if (cls5.isInstance(nnlVar5) && (nnnVar5 = this.a) != null) {
                    nnnVar5.a((nnl) cls5.cast(nnlVar5), i3);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface6 instanceof odd ? (odd) iInterfaceQueryLocalInterface6 : new odb(strongBinder6);
                }
                String string2 = parcel.readString();
                ifl.b(parcel);
                nnl nnlVar6 = (nnl) odc.a(odbVar);
                Class cls6 = this.b;
                if (cls6.isInstance(nnlVar6) && (nnnVar6 = this.a) != null) {
                    nnnVar6.e((nnl) cls6.cast(nnlVar6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface7 instanceof odd ? (odd) iInterfaceQueryLocalInterface7 : new odb(strongBinder7);
                }
                boolean zF = ifl.f(parcel);
                ifl.b(parcel);
                nnl nnlVar7 = (nnl) odc.a(odbVar);
                Class cls7 = this.b;
                if (cls7.isInstance(nnlVar7) && (nnnVar7 = this.a) != null) {
                    nnnVar7.d((nnl) cls7.cast(nnlVar7), zF);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface8 instanceof odd ? (odd) iInterfaceQueryLocalInterface8 : new odb(strongBinder8);
                }
                int i4 = parcel.readInt();
                ifl.b(parcel);
                nnl nnlVar8 = (nnl) odc.a(odbVar);
                Class cls8 = this.b;
                if (cls8.isInstance(nnlVar8) && (nnnVar8 = this.a) != null) {
                    nnnVar8.c((nnl) cls8.cast(nnlVar8), i4);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    odbVar = iInterfaceQueryLocalInterface9 instanceof odd ? (odd) iInterfaceQueryLocalInterface9 : new odb(strongBinder9);
                }
                int i5 = parcel.readInt();
                ifl.b(parcel);
                nnl nnlVar9 = (nnl) odc.a(odbVar);
                Class cls9 = this.b;
                if (cls9.isInstance(nnlVar9) && (nnnVar9 = this.a) != null) {
                    nnnVar9.i((nnl) cls9.cast(nnlVar9), i5);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(252505000);
                return true;
            default:
                return false;
        }
    }

    public nng(nnn nnnVar, Class cls) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
        this.a = nnnVar;
        this.b = cls;
    }
}
