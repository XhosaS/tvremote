package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lny;
import defpackage.lnz;
import defpackage.loa;
import defpackage.yqq;
import defpackage.yqr;
import defpackage.yqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new loa();
    public final String a;
    public final String b;
    public final lny c;
    public final lnz d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        lny lnyVar;
        this.a = str;
        this.b = str2;
        lnz lnzVar = null;
        switch (i) {
            case 0:
                lnyVar = lny.UNKNOWN;
                break;
            case 1:
                lnyVar = lny.NULL_ACCOUNT;
                break;
            case 2:
                lnyVar = lny.GOOGLE;
                break;
            case 3:
                lnyVar = lny.DEVICE;
                break;
            case 4:
                lnyVar = lny.SIM;
                break;
            case 5:
                lnyVar = lny.EXCHANGE;
                break;
            case 6:
                lnyVar = lny.THIRD_PARTY_EDITABLE;
                break;
            case 7:
                lnyVar = lny.THIRD_PARTY_READONLY;
                break;
            case 8:
                lnyVar = lny.SIM_SDN;
                break;
            case 9:
                lnyVar = lny.PRELOAD_SDN;
                break;
            default:
                lnyVar = null;
                break;
        }
        this.c = lnyVar == null ? lny.UNKNOWN : lnyVar;
        if (i2 == 0) {
            lnzVar = lnz.UNKNOWN;
        } else if (i2 == 1) {
            lnzVar = lnz.NONE;
        } else if (i2 == 2) {
            lnzVar = lnz.EXACT;
        } else if (i2 == 3) {
            lnzVar = lnz.SUBSTRING;
        } else if (i2 == 4) {
            lnzVar = lnz.HEURISTIC;
        } else if (i2 == 5) {
            lnzVar = lnz.SHEEPDOG_ELIGIBLE;
        }
        this.d = lnzVar == null ? lnz.UNKNOWN : lnzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            if (yqs.a(this.a, classifyAccountTypeResult.a) && yqs.a(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("accountType", this.a);
        yqqVarB.b("dataSet", this.b);
        yqqVarB.b("category", this.c);
        yqqVarB.b("matchTag", this.d);
        return yqqVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.r(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c.k);
        kkx.f(parcel, 4, this.d.g);
        kkx.b(parcel, iA);
    }
}
