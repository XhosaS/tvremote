package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class noy extends ifk implements noz {
    final /* synthetic */ npd a;

    public noy() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // defpackage.noz
    public final odd a() {
        return new odc(this.a);
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            nli nliVar = (nli) ifl.a(parcel, nli.CREATOR);
            parcel.readInt();
            ifl.b(parcel);
            oak oakVarB = npd.b(nliVar);
            parcel2.writeNoException();
            ifl.d(parcel2, oakVarB);
        } else if (i == 2) {
            odd oddVarA = a();
            parcel2.writeNoException();
            ifl.e(parcel2, oddVarA);
        } else if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(252505000);
        } else {
            if (i != 4) {
                return false;
            }
            nli nliVar2 = (nli) ifl.a(parcel, nli.CREATOR);
            npc npcVar = (npc) ifl.a(parcel, npc.CREATOR);
            ifl.b(parcel);
            oak oakVarA = this.a.a(nliVar2, npcVar);
            parcel2.writeNoException();
            ifl.d(parcel2, oakVarA);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noy(npd npdVar) {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
        this.a = npdVar;
    }
}
