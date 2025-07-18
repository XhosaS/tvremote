package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import defpackage.a;
import defpackage.sij;
import defpackage.tsk;
import defpackage.tss;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MapMaker {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int UNSET_INT = -1;
    tsk<Object> keyEquivalence;
    MapMakerInternalMap.Strength keyStrength;
    boolean useCustomMap;
    MapMakerInternalMap.Strength valueStrength;
    int initialCapacity = -1;
    int concurrencyLevel = -1;

    /* compiled from: PG */
    enum Dummy {
        VALUE
    }

    public MapMaker concurrencyLevel(int i) {
        int i2 = this.concurrencyLevel;
        sij.y(i2 == -1, "concurrency level was already set to %s", i2);
        a.H(i > 0);
        this.concurrencyLevel = i;
        return this;
    }

    public int getConcurrencyLevel() {
        int i = this.concurrencyLevel;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public int getInitialCapacity() {
        int i = this.initialCapacity;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public tsk<Object> getKeyEquivalence() {
        return (tsk) sij.I(this.keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    public MapMakerInternalMap.Strength getKeyStrength() {
        return (MapMakerInternalMap.Strength) sij.I(this.keyStrength, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMakerInternalMap.Strength getValueStrength() {
        return (MapMakerInternalMap.Strength) sij.I(this.valueStrength, MapMakerInternalMap.Strength.STRONG);
    }

    public MapMaker initialCapacity(int i) {
        int i2 = this.initialCapacity;
        sij.y(i2 == -1, "initial capacity was already set to %s", i2);
        a.H(i >= 0);
        this.initialCapacity = i;
        return this;
    }

    public MapMaker keyEquivalence(tsk<Object> tskVar) {
        tsk<Object> tskVar2 = this.keyEquivalence;
        sij.z(tskVar2 == null, "key equivalence was already set to %s", tskVar2);
        tskVar.getClass();
        this.keyEquivalence = tskVar;
        this.useCustomMap = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        return !this.useCustomMap ? new ConcurrentHashMap(getInitialCapacity(), 0.75f, getConcurrencyLevel()) : MapMakerInternalMap.create(this);
    }

    public MapMaker setKeyStrength(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.keyStrength;
        sij.z(strength2 == null, "Key strength was already set to %s", strength2);
        strength.getClass();
        this.keyStrength = strength;
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.useCustomMap = true;
        }
        return this;
    }

    public MapMaker setValueStrength(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.valueStrength;
        sij.z(strength2 == null, "Value strength was already set to %s", strength2);
        strength.getClass();
        this.valueStrength = strength;
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.useCustomMap = true;
        }
        return this;
    }

    public String toString() {
        tss tssVarH = sij.H(this);
        int i = this.initialCapacity;
        if (i != -1) {
            tssVarH.d("initialCapacity", i);
        }
        int i2 = this.concurrencyLevel;
        if (i2 != -1) {
            tssVarH.d("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.keyStrength;
        if (strength != null) {
            tssVarH.b("keyStrength", sij.J(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.valueStrength;
        if (strength2 != null) {
            tssVarH.b("valueStrength", sij.J(strength2.toString()));
        }
        if (this.keyEquivalence != null) {
            tssVarH.a("keyEquivalence");
        }
        return tssVarH.toString();
    }

    public MapMaker weakKeys() {
        setKeyStrength(MapMakerInternalMap.Strength.WEAK);
        return this;
    }

    public MapMaker weakValues() {
        setValueStrength(MapMakerInternalMap.Strength.WEAK);
        return this;
    }
}
