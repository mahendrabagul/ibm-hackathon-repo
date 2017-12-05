package io.github.mahendrabagul.springibmbluemixsample.data;

import java.util.Collection;

import com.cloudant.client.api.Database;

import io.github.mahendrabagul.springibmbluemixsample.model.Visitor;

/**
 * Defines the API for a ToDo store.
 *
 */
public interface VisitorStore {

	/**
	 * Get the target db object.
	 * 
	 * @return Database.
	 * @throws Exception
	 */
	public Database getDB();

	/**
	 * Gets all Visitors from the store.
	 * 
	 * @return All Visitors.
	 * @throws Exception
	 */
	public Collection<Visitor> getAll();

	/**
	 * Gets an individual ToDo from the store.
	 * 
	 * @param id
	 *            The ID of the ToDo to get.
	 * @return The ToDo.
	 */
	public Visitor get(String id);

	/**
	 * Persists a Visitor to the store.
	 * 
	 * @param td
	 *            The ToDo to persist.
	 * @return The persisted ToDo. The ToDo will not have a unique ID..
	 */
	public Visitor persist(Visitor vi);

	/**
	 * Updates a ToDo in the store.
	 * 
	 * @param id
	 *            The ID of the Visitor to update.
	 * @param td
	 *            The Visitor with updated information.
	 * @return The updated Visitor.
	 */
	public Visitor update(String id, Visitor vi);

	/**
	 * Deletes a ToDo from the store.
	 * 
	 * @param id
	 *            The ID of the Visitor to delete.
	 */
	public void delete(String id);

	/**
	 * Counts the number of Visitors
	 * 
	 * @return The total number of Visitors.
	 * @throws Exception
	 */
	public int count() throws Exception;
}
