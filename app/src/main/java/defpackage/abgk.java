package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abgk implements abxk {
    @Override // defpackage.abxk
    public final /* bridge */ /* synthetic */ Object a(int i) {
        abez abezVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : abez.AUTOMATION_TYPE_PERSONAL_ROUTINE : abez.AUTOMATION_TYPE_CUSTOM_HOUSEHOLD_ROUTINE : abez.AUTOMATION_TYPE_HOME_AWAY_ROUTINE : abez.AUTOMATION_TYPE_UNSPECIFIED;
        return abezVar == null ? abez.UNRECOGNIZED : abezVar;
    }
}
